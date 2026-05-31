# |<<

**单据对照表 (er_billcontrast / nc.vo.erm.billcontrast.BillcontrastVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1876.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billcontrast | 主键 | pk_billcontrast | char(20) | √ | 主键 (UFID) |
| 2 | src_billtypeid | 来源单据类型 | src_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | src_tradetypeid | 来源交易类型 | src_tradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | des_billtypeid | 目标单据类型 | des_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | des_tradetypeid | 目标交易类型 | des_tradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | app_scene | 应用场景 | app_scene | int |  | 单据对照应用场景 (billcontrast_scene) |  | 1=报销单与结转单对照; |