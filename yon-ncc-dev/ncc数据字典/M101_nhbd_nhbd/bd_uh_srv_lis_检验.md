# |<<

**检验 (bd_uh_srv_lis / com.yonyou.yh.nhis.bd.uhsrv.vo.UHSrvLisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1117.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvlis | 服务检验主键 | pk_srvlis | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_samptype | 标本类型 | pk_samptype | varchar(20) | √ | 标本类型(自定义档案) (Defdoc-030200) |
| 5 | pk_colltype | 采集方法 | pk_colltype | varchar(20) | √ | 采集方法(自定义档案) (Defdoc-030201) |
| 6 | pk_lisgroup | 检验分组 | pk_lisgroup | varchar(20) |  | 检验分组(自定义档案) (Defdoc-030202) |
| 7 | pk_contype | 试管类型 | pk_contype | varchar(20) |  | 试管类型(自定义档案) (Defdoc-030203) |
| 8 | std_hi | 标准上限 | std_hi | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | std_lo | 标准下限 | std_lo | decimal(14, 2) |  | 数值 (UFDouble) |
| 10 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 11 | note | 注意事项 | note | varchar(256) |  | 备注 (Memo) |
| 12 | dt_samptype | 标本类型编码 | dt_samptype | varchar(50) |  | 字符串 (String) |
| 13 | dt_colltype | 采集方法编码 | dt_colltype | varchar(50) |  | 字符串 (String) |
| 14 | dt_lisgroup | 检验分组编码 | dt_lisgroup | varchar(50) |  | 字符串 (String) |
| 15 | dt_contype | 试管类型编码 | dt_contype | varchar(50) |  | 字符串 (String) |