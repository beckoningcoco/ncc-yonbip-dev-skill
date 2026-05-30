# |<<

**手术 (bd_uh_srv_op / com.yonyou.yh.nhis.bd.uhsrv.vo.UHSrvOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1118.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srv_opt | 服务手术主键 | pk_srv_opt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_diag_op | 手术 | pk_diag_op | varchar(20) |  | 标准诊断编码 (stddiag) |
| 5 | opclass | 手术级别 | opclass | varchar(20) | √ | 手术等级(自定义档案) (Defdoc-030305) |
| 6 | opcode | 手术编码 | opcode | varchar(30) | √ | 字符串 (String) |
| 7 | pk_anae | 麻醉方法 | pk_anae | varchar(20) |  | 麻醉方法(自定义档案) (Defdoc-030300) |
| 8 | pk_oppos | 手术体位 | pk_oppos | varchar(20) |  | 手术体位(自定义档案) (Defdoc-030301) |
| 9 | pk_opbody | 手术部位 | pk_opbody | varchar(20) |  | 手术部位(自定义档案) (Defdoc-030302) |
| 10 | pk_cutclass | 切口等级 | pk_cutclass | varchar(20) |  | 切口等级(自定义档案) (Defdoc-030303) |
| 11 | pk_pd | 介入物编码 | pk_pd | varchar(20) |  | 介入物编码(自定义档案) (Defdoc-030304) |
| 12 | pdname | 介入物名称 | pdname | varchar(50) |  | 字符串 (String) |
| 13 | flag_drainage | 引流标志 | flag_drainage | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 15 | note | 备注说明 | note | varchar(256) |  | 备注 (Memo) |
| 16 | dt_anae | 麻醉方法编码 | dt_anae | varchar(50) |  | 字符串 (String) |
| 17 | dt_oppos | 手术体位编码 | dt_oppos | varchar(50) |  | 字符串 (String) |
| 18 | dt_opbody | 手术部位编码 | dt_opbody | varchar(50) |  | 字符串 (String) |
| 19 | dt_cutclass | 切口等级编码 | dt_cutclass | varchar(50) |  | 字符串 (String) |
| 20 | dt_pd | 介入物 | dt_pd | varchar(50) |  | 字符串 (String) |