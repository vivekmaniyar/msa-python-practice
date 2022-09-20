#%%
'''
Notes on data anyalysis
'''
import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

# Read data from csv file
df = pd.read_csv('Automobile_data.csv')

# Print the first 5 rows of the dataframe
#print(df.head())

# Print info about the dataframe
#print(df.info())

# Check for missing values in normalized-losses column
#lossesmissing = df['normalized-losses'].loc[df['normalized-losses']=='?'].count()
#print("Number of missing values in normalized-losses column: ", lossesmissing)

# Handle missing values in normalized-losses column
nl = df['normalized-losses'].loc[df['normalized-losses']!='?']
nlmean = nl.astype(str).astype(int).mean()
#print("Mean of normalized-losses: ", nlmean)
df['normalized-losses']=df['normalized-losses'].replace('?', nlmean).astype(int)
# lossesmissing = df['normalized-losses'].loc[df['normalized-losses']=='?'].count()
# print("Number of missing values in normalized-losses column: ", lossesmissing)
#print(df.head())

# Draw a histogram of the normalized-losses column
# df['normalized-losses'].hist(bins=5,color='orange')
# plt.title('Histogram of normalized-losses')
# plt.ylabel('Number of cars')
# plt.xlabel('Normalized losses')
# plt.show()

# Draw pie chart of fuel-type column
#print(df['fuel-type'].head())
# df['fuel-type'].value_counts().plot.pie(figsize=(5,5),autopct='%.2f')
# plt.title('Pie chart of fuel-type')

# Draw bar chart of Make column
# df.make.value_counts().nlargest(3).plot(kind='bar', figsize=(15,5))
# plt.title('Number of cars by make')
# plt.ylabel('Number of cars')
# plt.xlabel('Make')
# %%
