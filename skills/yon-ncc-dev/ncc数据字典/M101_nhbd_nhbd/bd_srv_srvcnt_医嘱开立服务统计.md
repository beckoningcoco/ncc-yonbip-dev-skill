# |<<

**医嘱开立服务统计 (bd_srv_srvcnt / com.yonyou.yh.nhis.bd.srvcnt.vo.SrvCntVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/967.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvcnt | 主键 | pk_srvcnt | char(20) | √ | 主键 (UFID) |
| 2 | pk_dept | 科室 | pk_dept | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 3 | pk_psn | 人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 4 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 5 | cnt | 次数 | cnt | int |  | 整数 (Integer) |