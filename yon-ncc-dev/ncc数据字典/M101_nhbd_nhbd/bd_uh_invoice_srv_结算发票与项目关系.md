# |<<

**结算发票与项目关系 (bd_uh_invoice_srv / com.yonyou.yh.nhis.bd.invoice.vo.InvoiceSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1049.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoicesrv | 主键 | pk_invoicesrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 5 | flag_ci | 分类或项目标识 | flag_ci | varchar(50) |  | 归属类别 (SrvContItemTypeEnum) |  | 0=服务分类; |