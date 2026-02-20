import { Routes } from '@angular/router';

import { JarvisLayoutComponent } from './layout/jarvis-layout.component';

export const JARVIS_ROUTES: Routes = [
  {
    path: '',
    component: JarvisLayoutComponent,
    children: [
      {
        path: '',
        redirectTo: 'dashboard',
        pathMatch: 'full',
      },
      {
        path: 'dashboard',
        loadComponent: () =>
          import('./dashboard/jarvis-dashboard.component').then(
            (m) => m.JarvisDashboardComponent,
          ),
      },
      {
        path: 'customers',
        loadComponent: () =>
          import('./customers/customers.component').then(
            (m) => m.CustomersComponent,
          ),
      },
      {
        path: 'leads',
        loadComponent: () =>
          import('./leads/leads.component').then((m) => m.LeadsComponent),
      },
      {
        path: 'contracts',
        loadComponent: () =>
          import('./contracts/contracts-management.component').then(
            (m) => m.ContractsManagementComponent,
          ),
      },
      {
        path: 'appointments',
        loadComponent: () =>
          import('./appointments/appointments-management.component').then(
            (m) => m.AppointmentsManagementComponent,
          ),
      },
      {
        path: 'commissions',
        loadComponent: () =>
          import('./commissions/commissions.component').then(
            (m) => m.CommissionsComponent,
          ),
      },
      {
        path: 'consulting',
        loadComponent: () =>
          import('./consulting/consulting.component').then(
            (m) => m.ConsultingComponent,
          ),
      },
    ],
  },
];
