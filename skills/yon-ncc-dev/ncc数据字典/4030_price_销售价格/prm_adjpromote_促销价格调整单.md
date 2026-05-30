# |<<

**促销价格调整单 (prm_adjpromote / nc.vo.price.adjustpromote.entity.AdjustPromoteHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4649.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjpromote | 促销价格调整单主键 | pk_adjpromote | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | vbillcode | 调价单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 5 | ctrantypeid | 调价类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | vtrantypecode | 调价类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_tariffdef | 价目表 | pk_tariffdef | varchar(20) |  | 价目表定义 (TariffDefHVO) |
| 8 | dbegindate | 生效日期 | dbegindate | char(19) |  | 日期时间 (UFDateTime) |
| 9 | denddate | 失效日期 | denddate | char(19) |  | 日期时间 (UFDateTime) |
| 10 | dadjustpricedate | 调价日期 | dadjustpricedate | char(19) |  | 日期 (UFDate) |
| 11 | vadjustpriceno | 调价文号 | vadjustpriceno | varchar(50) |  | 字符串 (String) |
| 12 | fbasediscountflag | 折扣表所属销售组织 | fbasediscountflag | int |  | 显示方式 (showpattern) |  | 1=本销售组织; |