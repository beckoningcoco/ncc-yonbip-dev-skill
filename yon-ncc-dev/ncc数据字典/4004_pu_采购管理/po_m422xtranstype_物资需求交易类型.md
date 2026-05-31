# |<<

**物资需求交易类型 (po_m422xtranstype / nc.vo.pu.po_reqtranstype.M422xtranstypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4601.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_m422xtranstype | 物资需求交易主键 | pk_m422xtranstype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | ctrantypeid | 交易类型主键 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | baseclassctrl | 基本分类控制 | baseclassctrl | char(1) |  | 布尔类型 (UFBoolean) |