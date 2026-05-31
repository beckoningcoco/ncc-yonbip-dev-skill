# |<<

**产品簇生产比例 (mm_pdfamrate / nc.vo.mmsop.productfamilyrate.entity.ProductFamilyRateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3719.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pdfamrate | 产品簇生产比例ID | pk_pdfamrate | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 3 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | fstatusflag | 单据状态 | fstatusflag | varchar(50) |  | 单据状态 (StatusEnum) |  | 0=默认; |