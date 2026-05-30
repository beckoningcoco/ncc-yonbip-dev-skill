# |<<

**条码标签 (bc_barcodelabel / nc.vo.bc.barcodelabel.entity.BarcodeLabelHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/238.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barcodelabel | 条码标签 | pk_barcodelabel | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vcode | 标签编码 | vcode | varchar(30) |  | 字符串 (String) |
| 6 | vname | 标签名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | fbisobject | 业务对象 | fbisobject | int |  | 条码标签业务对象 (BisObjectEnum) |  | 1=物料; |