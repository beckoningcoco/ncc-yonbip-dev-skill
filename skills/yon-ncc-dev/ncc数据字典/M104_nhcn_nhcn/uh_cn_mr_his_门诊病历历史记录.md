# |<<

**门诊病历历史记录 (uh_cn_mr_his / com.yonyou.yh.nhis.cn.ecd.vo.CNmrHisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6013.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cn_mr_his | 门诊病历历史记录主键 | pk_cn_mr_his | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_pv | 患者就诊主键 | pk_pv | char(20) |  | 主键 (UFID) |
| 5 | update_time | 修改时间 | update_time | char(19) |  | 日期时间 (UFDateTime) |
| 6 | operator_id | 修改人主键 | operator_id | char(20) |  | 主键 (UFID) |
| 7 | operator_name | 修改人名称 | operator_name | varchar(100) |  | 字符串 (String) |
| 8 | operation | 操作 | operation | varchar(50) |  | 字符串 (String) |