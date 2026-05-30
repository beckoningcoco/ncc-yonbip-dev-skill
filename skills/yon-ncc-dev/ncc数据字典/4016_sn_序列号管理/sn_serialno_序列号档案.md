# |<<

**序列号档案 (sn_serialno / nc.vo.sn.doc.entity.SerialNoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5376.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_serialno | 序列号档案主键 | pk_serialno | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 产生组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 产生组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | vcode | 序列号 | vcode | varchar(128) |  | 字符串 (String) |
| 8 | frefedflag | 使用状态 | frefedflag | int |  | 使用状态 (frefedflag) |  | 1=自由; |