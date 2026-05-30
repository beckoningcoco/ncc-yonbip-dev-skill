# |<<

**调拨出库单表头 (ic_transout_h / nc.vo.ic.m4y.entity.TransOutHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2999.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | 调拨出库单表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | cbiztype | 业务流程 | cbiztype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 6 | fmodetype | 调拨类型 | fmodetype | int |  | 调拨类型 (FModyType) |  | 0=普通; |