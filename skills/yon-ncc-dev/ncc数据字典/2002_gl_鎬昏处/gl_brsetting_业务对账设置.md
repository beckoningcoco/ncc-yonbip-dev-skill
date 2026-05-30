# |<<

**业务对账设置 (gl_brsetting / nc.vo.gl.busirecon.setting.BRSettingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2357.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_brsetting | 对账设置标识 | pk_brsetting | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_unit | 业务单元初始版本 | pk_unit | varchar(50) |  | 字符串 (String) |
| 4 | pk_unit_v | 业务单元 | pk_unit_v | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | closeaccctrltype | 关账控制方式 | closeaccctrltype | varchar(50) | √ | 关账控制方式 (closeaccctrltype) | 1 | 1=不检查; |