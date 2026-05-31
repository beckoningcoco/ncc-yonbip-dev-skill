# |<<

**分项成本明细 (cm_clsdetail / nc.vo.cm.bd.bd0105.ClsdetailHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1453.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cclsdetailid | 分项成本明细主键 | cclsdetailid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织主键 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本主键 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbusinessdate | 业务日期 | dbusinessdate | char(19) |  | 日期 (UFDate) |
| 7 | cperiod | 会计期间 | cperiod | char(7) |  | 主键 (UFID) |
| 8 | cmaterialid | 物料id | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cmaterialvid | 物料版本主键 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | cmarcostclassid | 物料成本分类ID | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 11 | nbeginblncnum | 期初结存量 | nbeginblncnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 12 | nbeginblncmoney | 期初结存金额 | nbeginblncmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nproductinnum | 生产入库量 | nproductinnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 14 | nproductinmoney | 生产入库金额 | nproductinmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | notherinnum | 其它入库量 | notherinnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 16 | notherinmoney | 其它入库金额 | notherinmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nproductoutnum | 生产领用量 | nproductoutnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 18 | nproductoutmoney | 生产领用金额 | nproductoutmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | notheroutnum | 其它领用量 | notheroutnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 20 | notheroutmoney | 其它领用金额 | notheroutmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nblncnum | 结存量 | nblncnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 22 | nblncmoney | 结存金额 | nblncmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 24 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 25 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 26 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 27 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |