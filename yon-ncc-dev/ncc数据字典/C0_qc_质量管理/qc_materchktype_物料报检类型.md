# |<<

**物料报检类型 (qc_materchktype / nc.vo.qc.materchecktype.entity.MaterCheckTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4846.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materchktype | 主键 | pk_materchktype | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 3 | icheckpoint | 报检点 | icheckpoint | int |  | 报检点 (CheckPointEnum) |  | 1=采购到货单; |