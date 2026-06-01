---
title: "权限管理体系"
type: reference
source: "iuap-权限管理红皮书 (117页)"
tags: ["BIP", "旗舰版", "权限", "三员", "数据权限", "功能权限", "MDD"]
created: 2026-06-01
---

# 权限管理体系

## 三位一体

功能权限 + 主组织权限 + 数据权限，不可分割。

## 三员模式

| 角色 | 核心职责 |
|------|----------|
| 系统管理员 (System Admin) | 创建角色、用户管理 |
| 安全保密管理员 (Security Admin) | 分配功能权限、用户授权、设置管理员授权 |
| 安全审计员 (Safety Auditor) | 查看系统管理员和安全保密管理员日志 |

三员互斥，不可兼任。三员开通后可选择性开通授权权。

## MDD 接入模式

### 功能权限

```properties
# 按钮权限开关
mdd.func.permissions.enable=true
```

三步控制：
1. 注册按钮
2. `bill_command` 表的 `auth_id` 注册为 `button_code`
3. 分配按钮权限并授权

### 主组织权限

```properties
mdd.org.permissions.enable=true
```

两种标记方式：
- `load_type=XML`：XML 元数据属性 `<attribute isMasterOrg="true"/>`
- `load_type=JSON`：编辑器勾选"流程-审批流组织"

Rule 编写需继承 `AbstractCommonRule` 并实现 `execute` 方法：

```java
public class XxxRule extends AbstractCommonRule {
    @Override
    public RuleExecuteResult execute(BillContext billContext, 
                                      Map<String, Object> paramMap) {
        BillDataDto bill = (BillDataDto) getParam(paramMap);
        // 业务逻辑...
        putParam(paramMap, "return", result);
        return new RuleExecuteResult(result);
    }
}
```

**组织权限关闭扩展点**：`ICustomOrgPermissionsHandler`
- `beforeMasterOrgPermissionExt()` → return false 关闭主组织权限
- `beforeReferMasterOrgPermissionExt()` → return false 关闭参照主组织权限

### 数据权限 SDK

```xml
<dependency>
    <groupId>com.yonyou</groupId>
    <artifactId>auth-permission-mdd</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

配置 Bean 扫描：
```java
@ComponentScan(value = "com.yonyou.permission.*")
```

推荐调用方式：
```java
AuthSdkFacadeUtils.handleAuthPermission();
// 或
@Autowired IAuthPermissionService authPermissionService;
authPermissionService.handleAuthPermission(context, schema);
```

## 权限调试

调试地址：`{domain}/iuap-auth/ucf-wh/auth/debug/index.html`

可查看：用户角色、功能权限项、数据权限范围、组织权限范围。

## 相关文档

- [[mdd-backend]] — MDD框架内置权限集成
- [[org-reference-list]] — 组织是权限的隔离维度
- [[digital-workbench]] — 工作台菜单依赖功能权限
