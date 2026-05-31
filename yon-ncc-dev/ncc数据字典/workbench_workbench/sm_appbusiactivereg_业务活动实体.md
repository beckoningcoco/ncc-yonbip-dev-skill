# |<<

**业务活动实体 (sm_appbusiactivereg / nc.vo.platform.workbench.AppBusiactiveRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5277.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiactive | 业务活动主键 | pk_busiactive | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | parent_id | 外键 | parent_id | char(20) |  | 字符串 (String) |
| 5 | description | 描述信息 | description | varchar(200) |  | 字符串 (String) |
| 6 | busi_pk | 业务pk | busi_pk | varchar(50) |  | 字符串 (String) |
| 7 | resid | 多语字段 | resid | varchar(50) |  | 字符串 (String) |