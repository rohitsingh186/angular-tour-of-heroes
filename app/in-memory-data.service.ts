import { InMemoryDbService } from 'angular-in-memory-web-api';

export class InMemoryDataService implements InMemoryDbService {
    createDb() {
		let heroes = [
		    { id: 11, name: 'Thor' },
		    { id: 12, name: 'Captain America' },
		    { id: 13, name: 'Iron man' },
		    { id: 14, name: 'Hulk' },
		    { id: 15, name: 'Black Widow' },
		    { id: 16, name: 'Hawkeye' },
		    { id: 17, name: 'Vision' },
		    { id: 18, name: 'Loki' },
		    { id: 19, name: 'Superman' },
		    { id: 20, name: 'Batman' }
		];

		return {heroes};
    }
}