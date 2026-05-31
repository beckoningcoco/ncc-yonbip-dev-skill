# |<<

**感染诊断字典维护 (bd_Infect_diag / com.yonyou.yh.nhis.cn.hims.vo.BdInfectDiagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/866.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infect_diag | 主键 | pk_infect_diag | char(20) | √ | 主键 (UFID) |
| 2 | infect_code | 感染诊断编码 | infect_code | varchar(50) |  | 字符串 (String) |
| 3 | infect_name | 感染诊断名称 | infect_name | varchar(50) |  | 字符串 (String) |
| 4 | pk_system | 分类主键 | pk_system | char(20) |  | 主键 (UFID) |
| 5 | dt_system | 分类 | dt_system | varchar(50) |  | 字符串 (String) |
| 6 | flagh_enable | 是否启用 | flagh_enable | char(50) |  | 字符串 (String) |
| 7 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_father | 上级感染诊断主键 | pk_father | char(20) |  | 主键 (UFID) |
| 10 | code_father | 上级感染诊断编码 | code_father | varchar(50) |  | 字符串 (String) |
| 11 | sortno | 排序号 | sortno | varchar(50) |  | 字符串 (String) |
| 12 | infect_cycle | 感染周期 | infect_cycle | varchar(50) |  | 字符串 (String) |
| 13 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 14 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 15 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 16 | flag_root | 一级节点标识 | flag_root | varchar(50) |  | 字符串 (String) |
| 17 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 18 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 20 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |