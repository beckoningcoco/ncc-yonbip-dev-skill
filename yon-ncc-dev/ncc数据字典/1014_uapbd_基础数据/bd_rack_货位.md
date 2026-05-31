# |<<

**货位 (bd_rack / nc.vo.bd.rack.RackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/950.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rack | 货位主键 | pk_rack | char(20) | √ | 字符串 (String) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_stordoc | 所属仓库 | pk_stordoc | char(20) | √ | 仓库 (stordoc) |
| 5 | code | 货位号 | code | varchar(40) | √ | 字符串 (String) |
| 6 | name | 货位名 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | pk_parent | 上级货位 | pk_parent | varchar(20) |  | 货位 (rack) |
| 8 | pk_psndoc | 保管员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | volume | 货位容积 | volume | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | isrmplace | 在途货位 | isrmplace | char(1) | √ | 布尔类型 (UFBoolean) |
| 11 | outpriority | 出库优先级 | outpriority | int |  | 整数 (Integer) |  | [-9999 , 9999] |
| 12 | inpriority | 入库优先级 | inpriority | int |  | 整数 (Integer) |  | [-9999 , 9999] |
| 13 | ischecked | 检验区货位 | ischecked | char(1) | √ | 布尔类型 (UFBoolean) |
| 14 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 15 | enablestate | 启用状态 | enablestate | int | √ | 启用状态 (enablestate) | 2 | 1=未启用; |