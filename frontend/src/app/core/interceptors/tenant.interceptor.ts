import { HttpInterceptorFn } from '@angular/common/http';

const TENANT_STORAGE_KEY = 'jnj_tenant_id';

export const tenantInterceptor: HttpInterceptorFn = (req, next) => {
  const tenantId = localStorage.getItem(TENANT_STORAGE_KEY);

  if (tenantId) {
    const cloned = req.clone({
      setHeaders: {
        'X-Tenant-ID': tenantId,
      },
    });
    return next(cloned);
  }

  return next(req);
};
