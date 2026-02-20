export interface User {
  id: string;
  email: string;
  firstName: string;
  lastName: string;
  role: UserRole;
  tenantId: string;
}

export enum UserRole {
  CUSTOMER = 'CUSTOMER',
  SINGLE_BROKER = 'SINGLE_BROKER',
  POOL_BROKER = 'POOL_BROKER',
  INSURER = 'INSURER',
  ADMIN = 'ADMIN',
}

export interface LoginRequest {
  email: string;
  password: string;
}

export interface LoginResponse {
  accessToken: string;
  refreshToken: string;
  expiresIn: number;
  userRole: UserRole;
}
