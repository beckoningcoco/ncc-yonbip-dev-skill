# |<<

**物料平衡分析 (mm_maba / nc.vo.mmpac.pac0424.MaBAVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3688.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmbaid | 物料平衡分析 | cmbaid | varchar(50) | √ | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | dmodate | 生产日期 | dmodate | char(19) |  | 日期 (UFDate) |
| 6 | fsstyle | 统计方式 | fsstyle | int |  | 统计方式 (FSStyleEnum) |  | 1=物料; |