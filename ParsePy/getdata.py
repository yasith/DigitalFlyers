from parse_rest.datatypes import Object
from parse_rest.connection import ParseBatcher
from parse_rest.connection import register
register('bR0fkne3E6YiRq4Q6UOU8DQsn5bzorLepjKZpFDz', 'dskQ992bFTvxTszIkMUtx5WmLO4cJKZpr7d0VNoA')

class Deal(Object):
    pass

deals = []

input_file = open("grocerydata.csv")
for line in input_file:
    line = line.split(',')
    deals.append(Deal(name=line[0], store=line[1], image=line[2], discount=line[3], price=line[4]))
    batcher = ParseBatcher()
    batcher.batch_save(deals)
