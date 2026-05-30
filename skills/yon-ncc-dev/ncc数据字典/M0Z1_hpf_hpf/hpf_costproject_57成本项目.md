# |<<

**57成本项目 (hpf_costproject / nc.vo.hpf.costproject.CostProjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2618.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costproject | 主键 | pk_costproject | char(20) | √ | 主键 (UFID) |
| 2 | code | 成本项目编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 成本项目名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | syscode | 来源系统 | syscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 5 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 7 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 10 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 11 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 12 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 13 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 14 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 15 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 16 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 17 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 18 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 19 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 20 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 21 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 22 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 23 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 24 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 25 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 26 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 27 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 28 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 29 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |
| 30 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 31 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 32 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 33 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |