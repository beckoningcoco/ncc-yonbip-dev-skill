# |<<

**页签实体 (sm_pageregister / nc.vo.sm.funcreg.PageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5326.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_page | 主信息 | pk_page | char(20) | √ | 主键 (UFID) |
| 2 | pagecode | 页签编码 | pagecode | varchar(50) |  | 字符串 (String) |
| 3 | pagename | 页签名称 | pagename | varchar(50) |  | 字符串 (String) |
| 4 | resid | 多语标识 | resid | varchar(50) |  | 字符串 (String) |
| 5 | parentid | 所属节点 | parentid | varchar(50) |  | 字符串 (String) |
| 6 | isbuttonpower | 是否启用按钮权限 | isbuttonpower | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | orgtypecode | 组织类型 | orgtypecode | varchar(50) |  | 组织类型枚举 (orgtypeEnumx) |
| 8 | busi_pk | 业务pk | busi_pk | varchar(50) |  | 字符串 (String) |