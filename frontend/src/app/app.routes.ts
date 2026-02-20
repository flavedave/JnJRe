import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    redirectTo: '/jarvis',
    pathMatch: 'full',
  },
  {
    path: 'james',
    loadChildren: () =>
      import('./features/james/james.routes').then((m) => m.JAMES_ROUTES),
  },
  {
    path: 'jarvis',
    loadChildren: () =>
      import('./features/jarvis/jarvis.routes').then((m) => m.JARVIS_ROUTES),
  },
  {
    path: 'auth',
    loadChildren: () =>
      import('./features/auth/auth.routes').then((m) => m.AUTH_ROUTES),
  },
  {
    path: '**',
    redirectTo: '/jarvis',
  },
];
