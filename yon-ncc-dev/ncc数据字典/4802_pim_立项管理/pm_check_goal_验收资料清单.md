# |<<

**验收资料清单 (pm_check_goal / nc.vo.ppm.projectcheck.DataGoalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4414.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_data_goal | 验收资料清单主键 | pk_data_goal | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 序号 | rowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_fillclass | 归档分类 | pk_fillclass | varchar(20) |  | 归档设置实体 (archive) |
| 4 | pk_center | 文档中心 | pk_center | varchar(20) |  | 文档中心 (DocCenterHeadVO) |
| 5 | center_name | 归档名称 | center_name | varchar(50) |  | 字符串 (String) |
| 6 | center_status | 归档状态 | center_status | int |  | 归档状态 (centerstatus) |  | 1=归档中; |