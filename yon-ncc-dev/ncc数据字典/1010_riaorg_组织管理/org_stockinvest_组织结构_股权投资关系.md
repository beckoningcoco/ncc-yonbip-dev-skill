# |<<

**组织结构_股权投资关系 (org_stockinvest / nc.vo.corg.StockInvestRelaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4176.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stockinvest | 股权投资关系主键 | pk_stockinvest | char(20) | √ | 主键 (UFID) |
| 2 | investor | 投资方 | investor | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 3 | investee | 被投资方 | investee | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | investdate | 投资日 | investdate | char(19) |  | 日期 (UFDate) |
| 5 | investproportion | 投资比例变动(%) | investproportion | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | assessmode | 核算方式 | assessmode | int | √ | 核算方式 (assessmode) |  | 0=成本法; |