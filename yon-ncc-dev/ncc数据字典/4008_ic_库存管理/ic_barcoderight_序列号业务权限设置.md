# |<<

**序列号业务权限设置 (ic_barcoderight / nc.vo.ic.barcoderight.BarcodeRightVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2884.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barcoderight | 主键 | pk_barcoderight | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | righttype | 权限类型 | righttype | varchar(50) |  | 序列号业务权限类型 (barcodeRightEnum) |  | 01=条码结存检查不足强制保存权限; |