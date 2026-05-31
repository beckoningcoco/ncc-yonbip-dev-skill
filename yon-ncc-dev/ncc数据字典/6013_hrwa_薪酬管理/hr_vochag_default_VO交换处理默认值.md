# |<<

**VO交换处理默认值 (hr_vochag_default / nc.vo.wa.conversion.VochagDefaultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2702.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vochag_default | 默认值主键 | pk_vochag_default | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(50) | √ | 字符串 (String) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 6 | def1 | 预制字段1 | def1 | varchar(20) | √ | 公共薪资项目 (waitem) |
| 7 | def2 | 预制字段2 | def2 | varchar(20) | √ | 薪资标准类别表 (WaGrade) |
| 8 | def3 | 预制字段3 | def3 | varchar(256) |  | 字符串 (String) |
| 9 | def4 | 预制字段4 | def4 | varchar(256) |  | 字符串 (String) |
| 10 | def5 | 预制字段5 | def5 | varchar(256) |  | 字符串 (String) |
| 11 | def6 | 预制字段6 | def6 | varchar(256) |  | 字符串 (String) |
| 12 | def7 | 预制字段7 | def7 | varchar(256) |  | 字符串 (String) |
| 13 | def8 | 预制字段8 | def8 | varchar(256) |  | 字符串 (String) |
| 14 | def9 | 预制字段9 | def9 | varchar(256) |  | 字符串 (String) |
| 15 | def10 | 预制字段10 | def10 | varchar(256) |  | 字符串 (String) |