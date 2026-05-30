# |<<

**仓库 (bd_stordoc / nc.vo.bd.stordoc.StordocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/968.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stordoc | 仓库主键 | pk_stordoc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属库存组织 | pk_org | char(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 4 | code | 仓库编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 仓库名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | storaddr | 仓库地址 | storaddr | varchar(20) |  | 地址簿 (address) |
| 7 | pk_address | 所属地点 | pk_address | varchar(20) |  | 地点档案 (addressdoc) |
| 8 | principalcode | 负责人 | principalcode | varchar(25) |  | 字符串 (String) |
| 9 | phone | 电话号码 | phone | varchar(30) |  | 字符串 (String) |
| 10 | gubflag | 废品库 | gubflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 11 | proflag | 生产仓库 | proflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 12 | mrpflag | 计划可用 | mrpflag | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 13 | csflag | 货位管理 | csflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 14 | isatpaffected | 影响可用量 | isatpaffected | char(1) | √ | 布尔类型 (UFBoolean) | Y |
| 15 | isstoreontheway | 在途仓 | isstoreontheway | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 16 | isdirectstore | 直运仓 | isdirectstore | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 17 | isagentstore | 代储仓 | isagentstore | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 18 | isobligate | 可预留 | isobligate | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 19 | iscommissionout | 委外仓 | iscommissionout | char(1) |  | 布尔类型 (UFBoolean) | N |
| 20 | operatesupplier | 加工商 | operatesupplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 21 | iscalculatedinvcost | 进行存货成本计算 | iscalculatedinvcost | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 22 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 23 | enablestate | 启用状态 | enablestate | int | √ | 启用状态 (enablestate) | 2 | 1=未启用; |