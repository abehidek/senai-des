import { QueryClient, QueryClientProvider } from 'react-query';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import Index from './screens/Index.jsx';
import Login from './screens/Login.jsx';
import SignUp from './screens/SignUp.jsx';
import CreateMatch from './screens/CreateMatch.jsx';

const Stack = createNativeStackNavigator();

const queryClient = new QueryClient()

export default function App() {
  return (
    <QueryClientProvider client={queryClient}>
      <NavigationContainer>
        <Stack.Navigator>
          <Stack.Screen name="Login" component={Login} />
          <Stack.Screen name="Cadastrar" component={SignUp} />
          <Stack.Screen name="Index" component={Index} options={{ headerShown:false }}/>
          <Stack.Screen name="Marcar Partida" component={CreateMatch} />
        </Stack.Navigator>
      </NavigationContainer>
    </QueryClientProvider>
  );
}
