from geopy.distance import vincenty
from geopy.geocoders import Nominatim

def distance(city1, city2):
	geolocator = Nominatim()
	loc1 = geolocator.geocode(city1)
	loc2 = geolocator.geocode(city2)
	return vincenty((loc1.latitude, loc1.longitude), (loc2.latitude, loc2.longitude)).miles

def vacation():
	print('write done when finished')
	c = input('Enter CITY, COUNTRY: ')
	cities = [c]
	while c != 'done':
		c = input('Enter CITY, COUNTRY: ')
		cities.append(c);
	cities.pop();
	def city_distances(cities):
		distances = list()
		for i in range(len(cities)-1):
			distances.append(distance(cities[i], cities[i+1]))
		return distances
	distances = city_distances(cities)

	sum = 0
	for i in range(len(cities)-1):
		sum += distances[i]
		print('{} -> {}: {} miles'.format(cities[i], cities[i+1], distances[i]))
	print('Total distance covered in your trip: {}'.format(sum))

vacation()