# |<<

**排班_手术服务 (uh_sch_srv_op / com.yonyou.yh.nhis.sch.sch.vo.SchSrvOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6270.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schsrvop | 排班服务明细主键 | pk_schsrvop | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_resop | 排班资源 | pk_resop | varchar(20) |  | 排班_手术资源 (schresop) |
| 5 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 6 | note | 备注 | note | varchar(4000) |  | 字符串 (String) |