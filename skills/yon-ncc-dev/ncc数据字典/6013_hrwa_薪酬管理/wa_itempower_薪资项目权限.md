# |<<

**薪资项目权限 (wa_itempower / nc.vo.wa.itempower.ItemPowerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6336.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_itempower | 薪资项目权限主键 | pk_itempower | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_class | 薪资类别主键 | pk_wa_class | varchar(20) | √ | 薪资方案 (WaClassVO) |
| 3 | pk_wa_item | 薪资项目主键 | pk_wa_item | varchar(20) | √ | 公共薪资项目 (waitem) |
| 4 | showorder | 显示顺序 | showorder | int |  | 整数 (Integer) |
| 5 | editflag | 编辑标志 | editflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | moduleflag | 模块标志 | moduleflag | int |  | 模块标志 (moduleenum) |  | 0=薪资; |