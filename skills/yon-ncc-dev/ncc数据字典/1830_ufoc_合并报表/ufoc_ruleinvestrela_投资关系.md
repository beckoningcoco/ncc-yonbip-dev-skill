# |<<

**投资关系 (ufoc_ruleinvestrela / nc.vo.ufoc.adjvouchrule.RuleInvestrelaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5893.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ruleinvestrela | 主键 | pk_ruleinvestrela | char(20) | √ | 主键 (UFID) |
| 2 | investor | 投资方 | investor | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 3 | investee | 被投资方 | investee | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | totalrate | 累计持股比例 | totalrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | repdataversion | 报表数据版本 | repdataversion | varchar(50) |  | 规则类型 (ruletype) |  | 5=个别报表; |