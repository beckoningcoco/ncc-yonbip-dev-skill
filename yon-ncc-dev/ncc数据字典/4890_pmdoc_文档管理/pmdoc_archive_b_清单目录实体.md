# |<<

**清单目录实体 (pmdoc_archive_b / nc.vo.pmdoc.archivesetting.ArchiveBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4568.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_archive_b | 清单目录主键 | pk_archive_b | char(20) | √ | 主键 (UFID) |
| 2 | pid | 上级清单目录 | pid | varchar(20) |  | 清单目录实体 (archivesublist) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | code | 清单编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 清单名称 | name | varchar(64) |  | 字符串 (String) |
| 7 | pk_billtype | 关联单据 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | billtype_code | 关联单据编码 | billtype_code | varchar(50) |  | 字符串 (String) |
| 9 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 10 | innercode | 内码 | innercode | varchar(50) |  | 字符串 (String) |
| 11 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 21 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 23 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 24 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 25 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 26 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 28 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 29 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 30 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |