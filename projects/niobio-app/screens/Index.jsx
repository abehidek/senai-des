import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';

import Home from './Home';
import Settings from './Settings';
import Chat from './Chat';

const Tab = createBottomTabNavigator();

export default function Index() {
  return (
    <Tab.Navigator>
      <Tab.Screen name="Home" component={Home} />
      <Tab.Screen name="Chat" component={Chat} />
      <Tab.Screen name="Settings" component={Settings} />
    </Tab.Navigator>
  );
}
