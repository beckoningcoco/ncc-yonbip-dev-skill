# |<<

**物料取价 (mapub_materialpullprice / nc.vo.mapub.materialpricebase.entity.MaterialPullPriceHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3597.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmaterialpullpriceid | 物料取价 | cmaterialpullpriceid | char(20) | √ | 主键 (UFID) |
| 2 | costtype | 成本类型 | costtype | varchar(20) |  | 成本类型 (mapub_costtype) |
| 3 | cperiod | 最新结存价会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 4 | cbegindate | 平均采购入库开始期间 | cbegindate | varchar(20) |  | 会计月份 (accperiodmonth) |
| 5 | cenddate | 平均采购入库截止期间 | cenddate | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | pk_org | 业务单元 | pk_org | varchar(50) |  | 字符串 (String) |
| 7 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |