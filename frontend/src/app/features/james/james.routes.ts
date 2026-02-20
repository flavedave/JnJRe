import { Routes } from '@angular/router';

import { JamesLayoutComponent } from './layout/james-layout.component';

export const JAMES_ROUTES: Routes = [
  {
    path: '',
    component: JamesLayoutComponent,
    children: [
      {
        path: '',
        redirectTo: 'dashboard',
        pathMatch: 'full',
      },
      {
        path: 'dashboard',
        loadComponent: () =>
          import('./dashboard/james-dashboard.component').then(
            (m) => m.JamesDashboardComponent,
          ),
      },
      {
        path: 'contracts',
        loadComponent: () =>
          import('./contracts/contracts.component').then(
            (m) => m.ContractsComponent,
          ),
      },
      {
        path: 'appointments',
        loadComponent: () =>
          import('./appointments/appointments.component').then(
            (m) => m.AppointmentsComponent,
          ),
      },
      {
        path: 'chat',
        loadComponent: () =>
          import('./chat/chat.component').then((m) => m.ChatComponent),
      },
      {
        path: 'claims',
        loadComponent: () =>
          import('./claims/claims.component').then((m) => m.ClaimsComponent),
      },
      {
        path: 'documents',
        loadComponent: () =>
          import('./documents/documents.component').then(
            (m) => m.DocumentsComponent,
          ),
      },
    ],
  },
];
