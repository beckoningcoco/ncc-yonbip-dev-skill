# |<<

**协同消息设置 (gl_reconcilemeg / nc.vo.gl.reconcile.rule.ReconcileMegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2455.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilemeg | 主键 | pk_reconcilemeg | char(20) | √ | 主键 (UFID) |
| 2 | pk_role | 相关角色 | pk_role | varchar(20) |  | 角色 (Role) |
| 3 | pk_reconcilerule | 协同业务规则 | pk_reconcilerule | varchar(20) |  | 协同业务规则 (reconcilerule) |
| 4 | ismsgcenter | 消息中心 | ismsgcenter | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | isemail | 电子邮件 | isemail | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | ismobile | 手机短信 | ismobile | char(1) |  | 布尔类型 (UFBoolean) |