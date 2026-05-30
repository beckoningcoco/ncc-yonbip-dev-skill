# |<<

**核销方案表 (arap_verify_fa / nc.vo.arap.verify.VerifyfaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/202.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify_fa | 表主键 | pk_verify_fa | varchar(20) | √ | 字符串 (String) |
| 2 | descripe | 描述 | descripe | varchar(512) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(128) |  | 字符串 (String) |
| 4 | node_code | 节点号 | node_code | varchar(40) |  | 字符串 (String) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_user | 用户 | pk_user | varchar(20) |  | 用户 (user) |
| 7 | pcltj | 批处理条件 | pcltj | varchar(1024) |  | 字符串 (String) |
| 8 | cytj | 常用条件 | cytj | varchar(2000) |  | 字符串 (String) |
| 9 | zdytj | 自定义条件 | zdytj | varchar(4000) |  | 字符串 (String) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | bf_transtype | 本方交易类型 | bf_transtype | varchar(36) |  | 单据类型 (BilltypeVO) |
| 12 | df_transtype | 对方交易类型 | df_transtype | varchar(36) |  | 单据类型 (BilltypeVO) |
| 13 | isinit | 默认自动核销方案 | isinit | varchar(1) |  | 字符串 (String) |