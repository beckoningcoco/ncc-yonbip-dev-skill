# |<<

**邮箱账户设置 (purp_account / nc.vo.pp.account.entity.AccountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4798.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account | 邮箱账户设置主键 | pk_account | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | vusername | 用户名 | vusername | varchar(50) |  | 字符串 (String) |
| 6 | vpassword | 密码 | vpassword | varchar(50) |  | 字符串 (String) |
| 7 | vmailaddr | 邮箱地址 | vmailaddr | varchar(50) |  | 字符串 (String) |
| 8 | vsendaddr | 发送邮件服务器(smtp) | vsendaddr | varchar(50) |  | 字符串 (String) |
| 9 | vrecvaddr | 接收邮件服务器(pop) | vrecvaddr | varchar(50) |  | 字符串 (String) |
| 10 | bdefault | 默认 | bdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_user | 用户 | pk_user | varchar(20) |  | 用户 (user) |