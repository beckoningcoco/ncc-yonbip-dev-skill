# |<<

**扫描方式主实体 (bd_ImageScanSetup / nc.vo.imag.ImageScanSetupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/857.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | 扫描方式主键 | pk_id | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | scanway | 影像扫描方式 | scanway | varchar(20) |  | 影像扫描方式 (enum) |  | 1=制单人扫描; |