# |<<

**装箱单表头 (ic_packbill_h / nc.vo.ic.m4w.entity.PackBillHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2949.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpackbillhid | 装箱单表头主键 | cpackbillhid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 装箱清单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | vpackboxno | 箱号 | vpackboxno | varchar(40) |  | 字符串 (String) |
| 5 | cpacktypeid | 箱类型 | cpacktypeid | varchar(20) |  | 包装箱类型 (PackTypeVO) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 8 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 9 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 10 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 11 | vinvbarcode | 物料条码 | vinvbarcode | varchar(50) |  | 字符串 (String) |