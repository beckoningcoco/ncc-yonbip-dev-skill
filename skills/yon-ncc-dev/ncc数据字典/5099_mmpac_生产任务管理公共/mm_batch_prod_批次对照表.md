# |<<

**批次对照表 (mm_batch_prod / nc.vo.mmpac.batchass.prod.entity.BatProdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3630.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prod | 批次对照 | pk_prod | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 产品版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | vpbatchcode | 生产批次号 | vpbatchcode | varchar(50) |  | 字符串 (String) |
| 6 | vinbatchcode | 库存批次号 | vinbatchcode | varchar(50) |  | 字符串 (String) |
| 7 | vpbatchcodeid | 生产批次号主键 | vpbatchcodeid | varchar(20) |  | 主键 (UFID) |
| 8 | vinbatchcodeid | 库存批次号主键 | vinbatchcodeid | varchar(20) |  | 主键 (UFID) |
| 9 | csmaterialid | 库存物料 | csmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | csmaterialvid | 库存物料版本 | csmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |