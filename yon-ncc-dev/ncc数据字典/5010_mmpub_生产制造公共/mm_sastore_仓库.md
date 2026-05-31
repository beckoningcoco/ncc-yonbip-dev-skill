# |<<

**仓库 (mm_sastore / nc.vo.mmpub.setanalysis.entity.SaStoreVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3776.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_store | 主键 | pk_store | char(20) | √ | 主键 (UFID) |
| 2 | pk_storeorgid | 库存组织 | pk_storeorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_storeorgvid | 库存组织版本 | pk_storeorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | vstordoc | 仓库 | vstordoc | varchar(20) |  | 仓库 (stordoc) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 6 | pk_org | 组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 7 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |