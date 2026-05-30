# |<<

**工程变更分析选项 (mm_ecaoption / nc.vo.ecn.eco.eca.entity.ECAOptionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3675.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ecaoption | 工程变更分析选项主键 | pk_ecaoption | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_user | 用户 | pk_user | varchar(20) |  | 用户 (user) |
| 6 | vbillcode | 单据编号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | ihistorydays | 历史天数 | ihistorydays | int |  | 整数 (Integer) |