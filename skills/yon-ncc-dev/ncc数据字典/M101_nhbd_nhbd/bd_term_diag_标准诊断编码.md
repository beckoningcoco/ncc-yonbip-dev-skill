# |<<

**标准诊断编码 (bd_term_diag / nc.vo.nhbd.mk.StdDiagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1002.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diag | 诊断主键 | pk_diag | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | diagcode | 诊断编码 | diagcode | varchar(50) |  | 字符串 (String) |
| 5 | diagname | 诊断名称 | diagname | varchar(50) |  | 字符串 (String) |
| 6 | pk_system | 编码体系 | pk_system | varchar(20) |  | 编码体系(自定义档案) (Defdoc-060000) |
| 7 | dt_system | 编码体系编码 | dt_system | varchar(50) |  | 字符串 (String) |
| 8 | pk_code_ehr | 健康档案标准分类 | pk_code_ehr | varchar(20) |  | 健康档案标准分类(自定义档案) (Defdoc-060001) |
| 9 | dt_code_ehr | 健康档案标准分类编码 | dt_code_ehr | varchar(50) |  | 字符串 (String) |
| 10 | pk_code_ph | 公共服务慢病 | pk_code_ph | varchar(20) |  | 公卫服务慢病(自定义档案) (Defdoc-060002) |
| 11 | dt_code_ph | 公共服务慢病编码 | dt_code_ph | varchar(50) |  | 字符串 (String) |
| 12 | pk_father | 上级诊断编码 | pk_father | varchar(20) |  | 标准诊断编码 (stddiag) |
| 13 | flag_pi | 上传患者信息标志 | flag_pi | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | mnecode | 助记符 | mnecode | varchar(50) |  | 字符串 (String) |
| 15 | innercode | 内部码 | innercode | varchar(50) |  | 字符串 (String) |
| 16 | eu_level | 手术等级 | eu_level | int |  | 整数 (Integer) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |