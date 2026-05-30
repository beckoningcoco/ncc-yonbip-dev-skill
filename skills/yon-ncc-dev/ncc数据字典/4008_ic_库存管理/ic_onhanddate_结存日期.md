# |<<

**结存日期 (ic_onhanddate / nc.vo.ic.onhand.init.OnhandDate)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2934.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_onhanddate | 主键 | pk_onhanddate | char(20) | √ | 主键 (UFID) |
| 2 | donhanddate | 结存日期 | donhanddate | varchar(19) |  | 日期 (UFDate) |
| 3 | istate | 状态 | istate | int |  | 整数 (Integer) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 主键 (UFID) |