# |<<

**对帐数据表 (ufoc_meetdata / nc.vo.hbbb.meetdata.MeetdataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5884.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetdata | 对账数据标识 | pk_meetdata | char(20) | √ | 主键 (UFID) |
| 2 | pk_self | 本方 | pk_self | char(20) |  | 主键 (UFID) |
| 3 | pk_opp | 对方 | pk_opp | char(20) |  | 主键 (UFID) |
| 4 | pk_scheme | 合并方案标识 | pk_scheme | varchar(20) |  | 合并方案 (hbscheme) |
| 5 | pk_dxrela | 抵销模板标识 | pk_dxrela | char(20) |  | 主键 (UFID) |
| 6 | aloneid | aloneid | aloneid | char(32) |  | 字符串 (String) |
| 7 | isself | 是否本方 | isself | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_contrastorg | 对账组织 | pk_contrastorg | char(20) |  | 主键 (UFID) |
| 9 | iscontrasted | 是否对符 | iscontrasted | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_keygroup | 关键字组合 | pk_keygroup | varchar(20) |  | 关键字组合 (关键字组合) |